import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AvailablebusComponent } from './availablebus.component';

describe('AvailablebusComponent', () => {
  let component: AvailablebusComponent;
  let fixture: ComponentFixture<AvailablebusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AvailablebusComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AvailablebusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
