import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-template-driven-forms',
  imports: [FormsModule],
  templateUrl: './template-driven-forms.html',
  styleUrl: './template-driven-forms.css',
})
export class TemplateDrivenForms {
  userName = '';
  passWord = '';
  handleSubmit(para:NgForm){
    console.log(para);
    console.log(para.value);
  }
}
