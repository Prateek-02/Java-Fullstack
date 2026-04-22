import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  imports: [ReactiveFormsModule],
  templateUrl: './reactive-forms.html',
  styleUrl: './reactive-forms.css',
})
export class ReactiveForms {
  // userName = new FormControl('');
  // password = new FormControl('');
  // onSubmit(){
  //   console.log(this.userName);
  //   console.log(this.password)
  // }

  logIn = new FormGroup({
    userName: new FormControl(''),
    password: new FormControl('')

  })

  getValue(){
    console.log(this.logIn)
    console.log(this.logIn.value);
  }
}
