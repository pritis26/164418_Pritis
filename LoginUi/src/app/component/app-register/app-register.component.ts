import { Component, OnInit } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { PasswordValidator } from './password.validator';

import { Router } from '@angular/router';
import { UserAccount } from 'src/userAccount';
import { UserService } from 'src/user.service';

@Component({
  selector: 'app-app-register',
  templateUrl: './app-register.component.html',
 /*  styleUrls: ['./app-register.component.css'] */
//  template: `
//   <img src="assets/img/quikr.png">
// `
})
export class AppRegisterComponent  {


  title = 'Quickr Registration page';
  submitted:boolean=false;
  response:any;
  userAccount:UserAccount=new UserAccount();
  constructor(private fb: FormBuilder,private route:Router,private userService: UserService) {}
  regForm: FormGroup;
  ngOnInit() {

    this.regForm = this.fb.group({
      name: ['', [Validators.required,Validators.maxLength(20),Validators.minLength(3) ]],
      /* email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')] ], */
      email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
      phonenumber:['',[Validators.required,Validators.minLength(10), Validators.maxLength(10),Validators.pattern('[6-9]\\d{9}')]],
      password:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ],
      confirmPassword:['', Validators.required ]
   }, { validator: PasswordValidator });
 }

 /* get f() { return this.regForm.controls; } */




 onRegiter(){
this.submitted=true;
  console.log("in register() method")
  console.log(this.userAccount)
  this.userService.addUser(this.userAccount)
      .subscribe((response) =>{ 
        this.response=response
        console.log(this.response.password)});
        //this.route.navigateByUrl("login");
   // this.userAccount = new UserAccount();
    //console.log(this.userAccount)


 }
  
 /*  public onLoginClick(){
    this.router.navigate(['./login']);
} */

// goLogin(){
//   this.router.navigateByUrl("./login")
// }
// public onLoginClick(){
//   this.router.navigate(['./login']);
// }
}
