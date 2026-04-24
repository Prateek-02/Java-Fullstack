import { ChangeDetectorRef, Component, inject, OnInit } from '@angular/core';
import { ProductsData } from '../services/Product/products-data';

@Component({
  selector: 'app-dashboard',
  imports: [],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css',
})
export class Dashboard implements OnInit{
  productData = inject(ProductsData);
  ref = inject(ChangeDetectorRef);
  productList !: any;

  

  ngOnInit(){
    this.fetchData();
  }

  fetchData(){
    this.productData.getData().subscribe({
      next: (a) => {
        this.productList = a;
        this.ref.detectChanges();
        console.log(a);
      },
      error: (err) => console.log(err),
      complete: () => console.log('Completed')
    });
  }

  val = {
    "title": "Special Updated Laptop",
    "price": 65000,
    "description": "Hp Laptop Ryzen11",
    "categoryId": 299,
    "images": ["https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpv8cmuBJfvoM6AOrRB3EWwWHJCVUeUaAcPg&s"]
  }

  createData(){
    this.productData.addData(this.val).subscribe({
      next: (v) => console.log(v),
      error: (err) => console.log(err),
      complete: () => console.log('Resource Created')
    })
  }

  update(){
    this.productData.updateData(this.val, 267).subscribe({
      next: (v) => console.log(v),
      error: (err) => console.log(err),
      complete: () => console.log('Resource Updated')
    })
  }

  delete(){
    this.productData.deleteData(274).subscribe({
      next: (v) => console.log(v),
      error: (err) => console.log(err),
      complete: () => console.log('Resource Deleted')
    })
  }
}
