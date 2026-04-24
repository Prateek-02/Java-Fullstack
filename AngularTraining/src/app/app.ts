import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Binding } from "./binding/binding";
import { Parent } from "./parent/parent";
import { Forms } from './forms/forms';
import { FormTask } from './form-task/form-task';
import { DataService } from './data-service/data-service';
import { Dashboard } from "./dashboard/dashboard";

@Component({
  selector: 'app-root',
  imports: [Dashboard],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('AngularTraining');
}
