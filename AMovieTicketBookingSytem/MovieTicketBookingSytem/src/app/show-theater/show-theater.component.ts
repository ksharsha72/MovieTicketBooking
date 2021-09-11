import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDataService } from '../customer-data.service';
import { Theater } from '../theater';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-show-theater',
  templateUrl: './show-theater.component.html',
  styleUrls: ['./show-theater.component.css']
})
export class ShowTheaterComponent implements OnInit {
  theaterList!:Array<Theater>;
  constructor(private _userApi:UserApiServiceService, private _router:Router) { }

  ngOnInit(): void {

    this._userApi.getAllTheater().subscribe(
      (theaterList)=>{
        console.log(theaterList);
        this.theaterList=theaterList;
      }

    )
  }

  back()
  {
    this._router.navigate(['/customerComp']);
  }

  

}
