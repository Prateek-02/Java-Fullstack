import { Component } from '@angular/core';
import { Child } from './child/child';

@Component({
  selector: 'app-parent',
  imports: [Child],
  templateUrl: './parent.html',
  styleUrl: './parent.css',
})
export class Parent {
  dataForChild = "Data Sent From Parent to Child";
  count = 100;
  arr = [1,2,3];
  isLoggedIn = true;
}
