import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerDataService } from '../customer-data.service';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  customer:Customer=new Customer();
  
  constructor(private _userApi:UserApiServiceService , private _router:Router) { }

  ngOnInit(): void {
  }

  regCustomer(customer:Customer){

    this._userApi.regCustomer(customer).subscribe(
      response=>{
        console.log(customer);
        alert("Registration Success");
        this._router.navigate(['/login']);
      }
    )
  }

}
