import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-add-admin',
  templateUrl: './add-admin.component.html',
  styleUrls: ['./add-admin.component.css']
})
export class AddAdminComponent implements OnInit {

  constructor(private _userApi:UserApiServiceService , private _router:Router) { }

  ngOnInit(): void {
  }

  addAdmin(admin :Admin)
  {
    this._userApi.addAdmin(admin).subscribe(
      response=>{
        console.log(admin);
        alert("Admin Details Added..");
        this._router.navigate(['/admin']);
      }
    )
    
  }

}
