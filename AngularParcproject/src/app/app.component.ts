import { Component } from '@angular/core';
import { HomeComponent } from "./home/home.component";
import { FormsModule } from '@angular/forms';
import { UpperCasePipe} from '@angular/common';  


@Component({
  selector: 'app-root',
  imports: [ HomeComponent,FormsModule, UpperCasePipe,],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'todoapp';

  parentmessage:string="i am from parent";

   imageUrl = 'https://angular.io/assets/images/logos/angular/angular.png';
  isDisabled = false;

  childMessage: string = '';

  receiveMessage(msg: string) {
    this.childMessage = msg;
  }
  name = '';

  show = true;

   fname = 'angular pipes';
}
