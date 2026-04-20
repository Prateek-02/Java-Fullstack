import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-binding',
  imports: [FormsModule],
  templateUrl: './binding.html',
  styleUrl: './binding.css',
})
export class Binding {
  user = "Sanjana";
  obj ={
    user:"Pogo",
    age:22,
    state:"Himachal"
  }
  data(){
    return `Welcome to angular ${this.obj.user}`;
  }
  arr=[1,2,3,4,5];
  result=true;
  image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSsHxhKzvUuMYDEodd5ezis-_oAcKJrAtEdO2gsavqZ53abFF1";

  count=0;
  handleClick(data:boolean){
    if(data){
      console.log("login success");
    }
    else{
      console.log("wrong input");
    }
    console.log("event clicked");
    this.count++;
  }
  SecondClick(){
    console.log("second clicked");

  }

  inputValue = "";
  handleInput(event:any){
    this.inputValue = event.target.value;
    console.log(this.inputValue);
    console.log(event);
  }

  inputData = "";
}