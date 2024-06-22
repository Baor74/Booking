package com.example.demo.controller.Service;


import com.example.demo.controller.Entity.Account;


public interface AccountService {
  Account Register (Account account);
  Account Login (String username, String password);
}
