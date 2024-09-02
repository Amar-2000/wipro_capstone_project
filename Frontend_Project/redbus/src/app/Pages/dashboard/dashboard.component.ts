import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import swal from 'sweetalert2';
import { BusserviceService } from '../../service/busservice.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {
  response:any;
  searchBusForm! : FormGroup;
  constructor(private router : Router, private busservice:BusserviceService, private fb:FormBuilder ){}

  ngOnInit(){

    this.searchBusForm = this.fb.group({

      source : [null, Validators.required],
      destination : [null, Validators.required],
      date : [null, Validators.required]
    })

    
  }

  
  
searching(){

  if(this.searchBusForm.value.source===null || this.searchBusForm.value.destination===null || this.searchBusForm.value.date===null ){
    swal.fire("Please Fill all the details");
  }
  
  else{
    this.busservice.searchBus(this.searchBusForm.value).subscribe((res)=>{
      console.log(this.searchBusForm.value);
      // console.log(res);
      this.response=res
      // console.log(this.response);
      this.busservice.setBusData(res);
      if(res===null){
        swal.fire("No buses available for this route");
      }
      
        this.router.navigate(['availablebus']);
      
      
    })
  
  
  }
    
  }


signout(){
  this.router.navigate(['loginsignup']);
}
feedback(){
  swal.fire("ThankYou...","For Your Response")
}
}
