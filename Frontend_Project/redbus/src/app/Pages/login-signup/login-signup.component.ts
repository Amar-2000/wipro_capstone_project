import { Component } from '@angular/core';
import { Router } from '@angular/router';
import swal from 'sweetalert2';
import { BusserviceService } from '../../service/busservice.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { emit } from 'node:process';

@Component({
  selector: 'app-login-signup',
  templateUrl: './login-signup.component.html',
  styleUrl: './login-signup.component.css'
})
export class LoginSignupComponent {

  registerUserForm!: FormGroup;
  loginUserForm!: FormGroup;

  data : any;
  constructor(private router : Router, private busservice:BusserviceService, private fb:FormBuilder) {}


  ngOnInit(){
    this.registerUserForm= this.fb.group({
      name : [null, Validators.required],
      email : [null, Validators.required, Validators.email],
      contact : [null, Validators.required],
      password : [null, Validators.required],
      confirmPass : [null, Validators.required]
    });
    this.loginUserForm=this.fb.group({
      email : [null, Validators.required, Validators.email],
      password : [null, Validators.required]
      
    })
  }

  registerUser(){

    if(this.registerUserForm.value.name===null || this.registerUserForm.value.email===null || this.registerUserForm.value.contact===null ||
      this.registerUserForm.value.password===null || this.registerUserForm.value.confirmPass===null){
      swal.fire("Please fill all details");
    }
    else{
// console.log(this.registerUserForm.value)
  this.busservice.registerUser(this.registerUserForm.value).subscribe((res)=>{
  console.log(res);
  // next : (data: any) => {this.data=data}
  
  swal.fire(res)
})
    }
    
  }

  userLogin(){
    this.busservice.userLogin(this.loginUserForm.value.email, this.loginUserForm.value.password).subscribe((res)=>{
      console.log(this.loginUserForm.value.email, this.loginUserForm.value.password)
      console.log(res);
      // this.response=res;
      if(res==="Login Successful"){
        this.router.navigate(['dashboard']);
      }
      else{
        swal.fire("Please Enter valid credentials");
      }

    });
  }

  response:any;
  activeForm : 'login' | 'register' ='login';
  // loginform(){
  //   if(this.response==="Login Successful"){
  //     this.router.navigate(['dashboard']);
  //   }
  //   else{
  //     swal.fire("Please Enter valid credentials");
  //   }
    
  // }
  toggleForm(form : 'login' | 'register'){
    this.activeForm = form;
  }
  // alert(){
  //   swal.fire("ThankYou...","Registered Succesfully")
  // }

}
