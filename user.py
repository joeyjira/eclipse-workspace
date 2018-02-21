#!/usr/bin/env python3

class User():
    def __init__(self, username, password):
        self.username = username
        self.password = password
        self.login_attempts = 0

    def get_username(self):
        user_login = input("Hi, what is your username? ")
        return user_login

    def get_password(self):
        user_pw = input("What is your password? ")
        return user_pw
    
    def increment_login_attempts(self):
        self.login_attempts += 1
        
    def run(self):
        logged_out = True
        
        while logged_out:
            password = self.get_password()
            if password == self.password:
                logged_out = False
                self.increment_login_attempts()
                print ("You have succesfully logged in after " + str(self.login_attempts) + " times!")
            else:
                self.increment_login_attempts()
                print ("Please re-enter the correct password this time!\n")
               
person1 = User("Michael", "dragonlover2")
person1.run()