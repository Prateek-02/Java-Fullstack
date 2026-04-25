import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Wild } from './wild';

describe('Wild', () => {
  let component: Wild;
  let fixture: ComponentFixture<Wild>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Wild],
    }).compileComponents();

    fixture = TestBed.createComponent(Wild);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
