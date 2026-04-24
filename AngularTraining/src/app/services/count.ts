import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class Count {
  count = 0;

  increase(){
    this.count++;
  }

  decrease(){
    this.count--;
  }

  reset(){
    this.count = 0;
  }


}
