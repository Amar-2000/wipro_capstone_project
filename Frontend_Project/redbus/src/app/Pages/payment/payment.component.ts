import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import swal from 'sweetalert2';
@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css'
})



export class PaymentComponent {
  payNowForm!: FormGroup;
  submitData:any;

  userName:any=null;
  cardNumber:any=null;
  DATE:any=null;
  CVV:any=null;
  upiID:any=null;
  constructor(private router : Router, private fb:FormBuilder){}





  activeForm : 'card' | 'upi' |'netbanking' ='card';
 toggleForm(form : 'card' | 'upi' | 'netbanking'){
    this.activeForm = form;
  }
 

topup(){
  if(this.userName===null || this.cardNumber===null || this.DATE===null || this.CVV===null || this.userName==="" || this.cardNumber==="" || this.DATE==="" || this.CVV===""){
    swal.fire("Please enter your card details");
  }
  else{
    swal.fire("ThankYou...","Your Ticket Is Booked Trip Details will be shared to your Email and Whatsapp")
  }
  this.router.navigate(['dashboard']);
}

  
  

top(){
  
  if(this.upiID===null || this.upiID===""){
    swal.fire("Please enter UPI Id ");
  }
  else{
    swal.fire("ThankYou...","Your Ticket Is Booked Trip Details will be shared to your Email and Whatsapp")
  }
    

  

}

}
