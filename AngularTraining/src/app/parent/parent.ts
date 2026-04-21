import { Component } from '@angular/core';
import { Child } from './child/child';

@Component({
  selector: 'app-parent',
  imports: [Child],
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent {
  // Parent -> Child
  dataForChild = "Data Sent From Parent to Child";
  count = 100;
  arr = [1,2,3];
  isLoggedIn = true;


  //Child -> Parent
  val:number[] = []; //storing the data coming from parent
  val2: any;  // storing the object coming from parent

  childEvent(a:any){
    // console.log("Clicked By Child")
    // alert("Child Clicked The Button")
    // this.val = a;
    this.val2 = a;
  }

}
