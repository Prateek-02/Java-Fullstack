import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-child',
  imports: [CommonModule],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {   
  // Parent->Child
  // @Input() data:string = "";
  // or
  // @Input() data!:string

  // @Input() val:number = 0;
  // @Input() loginVal:boolean=false;
  // @Input() arrVal: number[] = [];

  // Child -> Parent
  // @Output() ChildData = new EventEmitter;

  // obj = {
  //   username : "Rohit",
  //   favShot : "Pull",
  //   team : "India"
  // }
  // result(){
  //   // this.ChildData.emit();
  //   // this.ChildData.emit([10,20,30,40,50]);
  //   this.ChildData.emit(this.obj);
  // }

  // Directives
  
  //NgClass
  active = true;
  change = false;
  handleClass(){
    this.active = !this.active;
    this.change = !this.change;
  } 

  //NgStyle
  // col = 'blue';
  // bg = 'yellow';
  // or
  css = {
    color : 'blue',
    backgroundColor : 'yellow'
  }

  css2 = {
    color : 'aqua',
    backgroundColor : 'black'
  }

  useFirstStyle = true;
  changeStyle(){
    this.useFirstStyle = !this.useFirstStyle;
  }
  
  // Structural Directive

  //1. ngIf
  isLoggedIn = false;
  handleLogin(a:any){
    this.isLoggedIn = a;
  }

  //2. ngFor
  arr = ["Java","C++","React","Angular","JavaScript"];

  //3. ngSwitch
  user = "admin";


  // Pipe
  userName = "SaNjAnA cHaNdeL";
  date = new Date();
  price = 100;

  userData={
    id:1,
    firstName:"Prateek",
    lastName:'Sinha',
    age:22,
    address:{
      state:'Jharkhand',
      city:'Giridih'
    }
  }

}
