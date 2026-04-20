import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.html',
  styleUrl: './child.css',
})
export class Child {
  @Input() data:string = "";
  // or
  // @Input() data!:string

  @Input() val:number = 0;
  @Input() loginVal:boolean=false;
  @Input() arrVal: number[] = [];
  
}
