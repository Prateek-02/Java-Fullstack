import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { NgClass } from '@angular/common';

@Component({
  selector: 'app-form-task',
  imports: [ReactiveFormsModule,NgClass],
  templateUrl: './form-task.html',
  styleUrl: './form-task.css',
})
export class FormTask {
  regForm = new FormGroup({
    fName: new FormControl('', [Validators.required, Validators.minLength(3)]),
    lName: new FormControl('', [Validators.required,Validators.minLength(3)]),
    pNo: new FormControl('', [Validators.required, Validators.min(1000000000),Validators.max(9999999999)]),      
    email: new FormControl('', [Validators.required, Validators.email]),
    gender: new FormControl('', Validators.required),
    subject: new FormControl('', Validators.required),
    state: new FormControl('', Validators.required),
    city: new FormControl('', [Validators.required,Validators.minLength(5)]),
    pincode: new FormControl('', [Validators.required, Validators.min(100000),Validators.max(999999)]),
    date: new FormControl('', Validators.required)
  })

  getData(){
    console.log(this.regForm.value);
    this.regForm.get('fName')?.setValue('James')
    this.regForm.get('lName')?.setValue('Anderson')
  }

  enableField(){
    this.regForm.get('pNo')?.enable();
  }

  disableField(){
    this.regForm.get('pNo')?.disable();
  }

  lNameField(){
    if(this.regForm.get('lName')?.valid){
      this.regForm.get('pNo')?.enable();
    }
    else{
      this.regForm.get('pNo')?.disable();
    }
  }
}
