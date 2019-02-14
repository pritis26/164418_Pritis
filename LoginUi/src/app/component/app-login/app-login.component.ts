import { Component, OnInit,Input } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginAccount } from 'src/loginAccount';
import { UserService } from 'src/user.service';
import { UserAccount } from 'src/userAccount';

@Component({
  selector: 'app-login',
  templateUrl: './app-login.component.html',
  styleUrls: ['./app-login.component.css']
})
export class LoginComponent implements OnInit {
title:"Quickr Login Page";



submitted:boolean=false;
 response: any ;
  constructor(private fb: FormBuilder,private route:Router,private userService: UserService) { }
  loginForm: FormGroup;

  loginAccount:LoginAccount=new LoginAccount();
  userAccount:UserAccount=new UserAccount();
  ngOnInit() {
    this.loginForm=this.fb.group(
{
  email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
  password:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]]

})
  }
  onLogin(){
    this.submitted=true
    console.log("in login() method")
    console.log(this.loginAccount)
      this.userService.callService(this.loginAccount)
      .subscribe((response) =>{ 
        this.response=response
        console.log(this.response)});
      
      console.log(this.loginAccount)

      if(this.response){

      }
/*     this.route.navigateByUrl("home"); */
     }
     onProduct():any{
     

      this.route.navigateByUrl("");
    

     }
     onLoginPage(){
       
           this.route.navigateByUrl("home");
     }
}
