import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDataService } from '../customer-data.service';
import { Theater } from '../theater';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-add-theater',
  templateUrl: './add-theater.component.html',
  styleUrls: ['./add-theater.component.css']
})
export class AddTheaterComponent implements OnInit {

  constructor(private _userApi:UserApiServiceService , private _router:Router) { }

  ngOnInit(): void {
  }

  addTheater(theater:Theater)
  {
    this._userApi.addTheater(theater).subscribe(
      response=>{
        console.log(theater);
        alert("Theater Details Added..");
        this._router.navigate(['/admin']);
      }
    )
   
    
  }

}
