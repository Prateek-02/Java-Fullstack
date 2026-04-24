import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class User {
  person = {
    firstName: "Sanjana",
    lastName: "Chandel",
    age:22,
    isAlive: true,
    sal: 100,
    address : {
      state: "Himachal",
      pincode: 174002
    }
  }
}
