package com.in28minutes.Springboot.Controller;


import com.in28minutes.Springboot.dto.UserDto;
import com.in28minutes.Springboot.entity.User;
import com.in28minutes.Springboot.exception.ErrorDetails;
import com.in28minutes.Springboot.exception.ResourceNotFoundException;
import com.in28minutes.Springboot.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

   private UserService userService;


   @PostMapping
   public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto user){
       UserDto savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
   }

   @GetMapping("{id}")
   public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
  UserDto user = userService.getUserById(userId);
  return new ResponseEntity<>(user, HttpStatus.OK);
   }

  @GetMapping
   public ResponseEntity<List<UserDto>> getAllUsers(){
       List<UserDto> users = userService.getAllUsers();
       return new ResponseEntity<>(users, HttpStatus.OK);
   }
@PutMapping("{id}")
   public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                          @RequestBody @Valid UserDto user){
       user.setId(userId);
      UserDto updatedUser = userService.updateUser(user);
       return new ResponseEntity<>(updatedUser,HttpStatus.OK);
   }
   @DeleteMapping("{id}")
   public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){

       userService.deleteUser(userId);
       ResponseEntity<String> responseEntity = new ResponseEntity<>("User successfully deleted!", HttpStatus.
               OK);
       return responseEntity;
        }

//        @ExceptionHandler(ResourceNotFoundException.class)
//        public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
//                                                                            WebRequest webRequest) {
//ErrorDetails errorDetails = new ErrorDetails(
//        LocalDateTime.now(),
//        exception.getMessage(),
//        webRequest.getDescription(false),
//        "USER_NOT_FOUND"
//);
//return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
//
//   }

        }
