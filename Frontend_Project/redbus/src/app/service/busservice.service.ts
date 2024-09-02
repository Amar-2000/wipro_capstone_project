import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { LoginSignupComponent } from '../Pages/login-signup/login-signup.component';

const strUrl = "http://localhost:8080/api/"

@Injectable({
  providedIn: 'root'
})
export class BusserviceService {

  private busDataSubject = new BehaviorSubject<any>(null);
  busData$ = this.busDataSubject.asObservable();

  public busData!:any;
  constructor(private http:HttpClient) { 
   
  }

  // username="user@gmail.com";
  // password="pass";
  registerUser(user:any):Observable<any>{
    console.log(user);
    return this.http.post(strUrl + "register",user, {responseType:'text'});
  }

   

  userLogin(email:any, password:any):Observable<any>{
    // console.log(email, password)
      return this.http.get(strUrl + "login?email=" + email + "&password=" + password, {responseType:'text'}); 
  }

  searchBus(busDetails:any):Observable<any>{
    return this.http.post(strUrl + "search-buses" , busDetails);
  }

  setBusData(data:any){
    this.busDataSubject.next(data);
  }
}
