import { Component, Input , EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
@Input() message:string="";

@Output() messageEvent = new EventEmitter<string>();

  sendMessage() {
    this.messageEvent.emit("I am from child component");
  }
}
