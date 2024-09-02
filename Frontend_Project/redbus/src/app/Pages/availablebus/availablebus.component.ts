import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { BusserviceService } from '../../service/busservice.service';

@Component({
  selector: 'app-availablebus',
  templateUrl: './availablebus.component.html',
  styleUrl: './availablebus.component.css'
})
export class AvailablebusComponent {
  busData:any;
  constructor(private router : Router, private busservice:BusserviceService){}


ngOnInit(){
  this.busservice.busData$.subscribe(data=>{
    this.busData = data;
    console.log(this.busData);
  })
}
  payment(){
    this.router.navigate(['payment']);
  
  }

}
