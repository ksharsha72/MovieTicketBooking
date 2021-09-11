import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerDataService } from '../customer-data.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  constructor(private _router:Router) { }

  ngOnInit(): void {
  }

  // validateCustomer(customer:Customer){
  //   console.log("ENTERED");
  //   console.log(this.customerData.customerMap);
  //    console.log("lts");
  //   if("admin@gmail.com" === customer.customerEmail && "admin" === customer.customerPassword)
  //   {
  //     alert("Login Success")
  //     console.log("Login Success");
  //     this._router.navigate(['/admin']);
  //   }
  //   else if(this.customerData.customerMap.has(customer.customerEmail))
  //   {
      
  //     if(this.customerData.customerMap.get(customer.customerEmail)![0].customerPassword === customer.customerPassword)
  //     {
  //       console.log("Login Successfull");
  //       alert("Login Success");
  //       this._router.navigate(['/customerComp']);

  //     }
  //     else
  //     {
  //       alert("Login Failed");
  //       console.log("Login Unsuccessfull");
  //     }
      
  //   }
  //   else
  //   {
  //     alert("Login Failed");
  //     console.log("Login Failed");
  //   }
    
   
  // }


  validateCustomer(customer:Customer)
  {
    console.log("ENTEREDM");
    if("admin@gmail.com" === customer.customerEmail && "admin" === customer.customerPassword)
       {
         console.log("ENTERED");

       alert("Login Success")
       console.log("Login Success");
        this._router.navigate(['/admin']);
      }
    else if(customer.customerEmail === "c@gmail.com")
    {
      console.log("ENTEREDC");
      this._router.navigate(['/customerComp']);
    }
    else
    {
      console.log("ENTEREDElse");
    }
  }

}
