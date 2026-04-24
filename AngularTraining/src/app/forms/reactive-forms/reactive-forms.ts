import { NgClass } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-forms',
  imports: [ReactiveFormsModule, NgClass],
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
    userName: new FormControl('', [Validators.required, Validators.minLength(3)]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)])

  })

  getValue(){
    console.log(this.logIn)
    console.log(this.logIn.value);
  }
}
