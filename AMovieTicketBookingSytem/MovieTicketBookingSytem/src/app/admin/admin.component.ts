import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDataService } from '../customer-data.service';
import { Movie } from '../movie';
import { UserApiServiceService } from '../user-api-service.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  
 
  constructor(private _userApi:UserApiServiceService ,private _router:Router) { }

  ngOnInit(): void {
  }

  addMovie():any
  {
    this._router.navigate(['/addMovie']);
  }

  deleteMovie(){

    let id:number;
    id=parseInt(prompt("Enter Movie Id To Be Deleted")!);
    if( confirm("Sure to Delete?")){
 
     this._userApi.deleteMovie(id).subscribe(
       response=>{
         if(response){
           alert("Deleted Movie [ID - "+id+"]");
         }
         else{
           alert("Unable to delete Movie [ID - "+id+"]");
         }
       }
     )
    
    }
   }

  addTheater():any
  {
    this._router.navigate(['/addTheater']);
  }

  addAdmin():any
  {
    this._router.navigate(['/addAdmin']);
  }

  showAllAdmin()
  {
    this._router.navigate(['/showAdmin']);
  }

  showAllCustomer()
  {
    this._router.navigate(['/showCustomer']);
  }

  

  deleteTheater(){
    let id:number;
    id=parseInt(prompt("Enter Theater Id To Be Deleted")!);
    if( confirm("Sure to Delete?")){
 
     this._userApi.deleteTheater(id).subscribe(
       response=>{
         if(response){
           alert("Deleted Theater [ID - "+id+"]");
         }
         else{
           alert("Unable To Delete Theater [ID - "+id+"]");
         }
       }
     )
    
    }
   }

   showAllMovie():any
   {
     this._router.navigate(['/showMovie']);

   }

   showAllTheater():any
   {
     this._router.navigate(['/showTheater']);

   }

  logOut():any
  {
    this._router.navigate(['/register']);
  }
}
