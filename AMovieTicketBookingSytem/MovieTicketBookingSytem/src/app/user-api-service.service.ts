import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Movie } from './movie';
import { Theater } from './theater';
import { Admin } from './admin';


@Injectable({
  providedIn: 'root'
})
export class UserApiServiceService {


  baseUrl="http://localhost:8000/api/users"

  constructor(private _http:HttpClient) { }
  
  public regCustomer(customer:Customer):Observable<Customer>
  {  
    return this._http.post<Customer>(this.baseUrl+'/customer/reg',customer); 
  }

  public addAdmin(admin:Admin):Observable<Admin>
  {  
    return this._http.post<Admin>(this.baseUrl+'/admin',admin); 
  }

  public getAllAdmin():Observable<Array<Admin>>
  {
    return this._http.get<Array<Admin>>(this.baseUrl+"/admin");
  }

  public getAllCustomer():Observable<Array<Customer>>
  {
    return this._http.get<Array<Customer>>(this.baseUrl+"/customer");
  }

  public addTheater(theater:Theater):Observable<Theater>
  {  
    return this._http.post<Theater>(this.baseUrl+'/admin/theater',theater); 
  }

  public getAllTheater():Observable<Array<Theater>>
  {
    return this._http.get<Array<Theater>>(this.baseUrl+"/public/theater");
  }

  public deleteTheater(theaterId:number):Observable<boolean>
  {
    return this._http.delete<boolean>(this.baseUrl+"/admin/theater/"+theaterId);
  }

  public addMovie(movie:Movie):Observable<Movie>
  {  
    return this._http.post<Movie>(this.baseUrl+'/admin/movie',movie);
  }
   
  public getAllMovie():Observable<Array<Movie>>
  {
    return this._http.get<Array<Movie>>(this.baseUrl+"/public/movie");
  }

  public deleteMovie(movieId:number):Observable<boolean>
  {
    return this._http.delete<boolean>(this.baseUrl+"/admin/movie/"+movieId);
  }

  public getTheaterByCity(theaterCity:string):Observable<Array<Theater>>{
    console.log("EnteredService")
    return this._http.get<Array<Theater>>(this.baseUrl+"/customer/theater/"+theaterCity);
  }

  public getMovieByTheater(theaterName:string):Observable<Array<Movie>>{
    console.log("EnteredService")
    return this._http.get<Array<Movie>>(this.baseUrl+"/customer/theaterName/"+theaterName);
  }


  // public updatePerson(person:Person):Observable<Person>{
  //   return this._http.put<Person>(this.baseUrl+'/persons',person);
  // }

  // public deletePerson(personId:number):Observable<boolean>{
  //   return this._http.delete<boolean>(this.baseUrl+"/persons/id/"+personId);
  // }


  // public getAllPersons():Observable<Array<Person>>{
  //   return this._http.get<Array<Person>>(this.baseUrl+"/persons");
  // }


}