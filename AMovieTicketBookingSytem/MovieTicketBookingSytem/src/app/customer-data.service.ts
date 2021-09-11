import { Injectable } from '@angular/core';
import { Customer } from './customer';
import { Movie } from './movie';
import { Theater} from './theater';

@Injectable({
  providedIn: 'root'
})
export class CustomerDataService {

  constructor() { }
    customerList:Array<Customer>=[];
    customerMap: Map<string,Array<Customer>>= new Map<string, Array<Customer>>();
    theaterList:Array<Theater>=[];
    theaterMap: Map<number,Array<Theater>>= new Map<number, Array<Theater>>();
    movieList:Array<Movie>=[];
    movieMap: Map<number,Array<Movie>>= new Map<number, Array<Movie>>();



}
