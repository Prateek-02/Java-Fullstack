import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Binding } from "./binding/binding";
import { Parent } from "./parent/parent";

@Component({
  selector: 'app-root',
  imports: [Parent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('AngularTraining');
}
