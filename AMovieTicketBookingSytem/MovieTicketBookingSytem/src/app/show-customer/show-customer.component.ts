import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-show-customer',
  templateUrl: './show-customer.component.html',
  styleUrls: ['./show-customer.component.css']
})
export class ShowCustomerComponent implements OnInit {

  cList!:Array<Customer>;
  constructor(private _userApi:UserApiServiceService, private _router:Router) { }

  ngOnInit(): void {
    this._userApi.getAllCustomer().subscribe(
      (cList)=>{
        console.log(cList);
        this.cList=cList;
      }

    )
  }

  back():any
  {
    this._router.navigate(['/admin']);
  }

}
