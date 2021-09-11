import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-show-admin',
  templateUrl: './show-admin.component.html',
  styleUrls: ['./show-admin.component.css']
})
export class ShowAdminComponent implements OnInit {

  adminList!:Array<Admin>;
  constructor(private _userApi:UserApiServiceService, private _router:Router) { }

  ngOnInit(): void {
    this._userApi.getAllAdmin().subscribe(
      (adminList)=>{
        console.log(adminList);
        this.adminList=adminList;
      }

    )
  }

  back():any
  {
    this._router.navigate(['/admin']);
  }
}
