import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductsData {
  http = inject(HttpClient);

  productsApi = "https://api.escuelajs.co/api/v1/products";

  getData(){
    return this.http.get(this.productsApi);
  }

  addData(data:any){
    return this.http.post(this.productsApi,data);
  }

  updateData(data:any, id:number){
    return this.http.put(`${this.productsApi}/${id}`,data);
  }

  deleteData(id:number){
    return this.http.delete(`${this.productsApi}/${id}`);
  }
}
