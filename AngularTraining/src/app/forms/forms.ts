import { Component } from '@angular/core';
import { TemplateDrivenForms } from './template-driven-forms/template-driven-forms';
import { ReactiveForms } from './reactive-forms/reactive-forms';

@Component({
  selector: 'app-forms',
  imports: [ReactiveForms],
  templateUrl: './forms.html',
  styleUrl: './forms.css',
})
export class Forms {
  val="";
  handleChange(){
    console.log('value changed');
    console.log(this.val);
  }
}
