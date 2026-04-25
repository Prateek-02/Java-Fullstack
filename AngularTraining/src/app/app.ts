import { Component, inject, signal } from '@angular/core';
import { RouterOutlet, RouterLinkWithHref, Router } from '@angular/router';
import { Binding } from "./binding/binding";
import { Parent } from "./parent/parent";
import { Forms } from './forms/forms';
import { FormTask } from './form-task/form-task';
import { DataService } from './data-service/data-service';
import { Dashboard } from "./dashboard/dashboard";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterLinkWithHref],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  // protected readonly title = signal('AngularTraining');

  route = inject(Router);
  change: boolean = true;

  login(){
    if(this.change){
      this.route.navigate(['/home']);
      console.log(this.route.url);
      this.change = false;
    }
    else{
      this.route.navigate(['/forms']);
      console.log(this.route.url);
      this.change = true;
    }
  }
}
