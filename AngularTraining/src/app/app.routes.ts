import { Routes } from '@angular/router';
import { Forms } from './forms/forms';
import { Dashboard } from './dashboard/dashboard';
import { DataService } from './data-service/data-service';
import { Navbar } from './navbar/navbar';
import { Wild } from './wild/wild';
import { Home } from './home/home';
import { FormTask } from './form-task/form-task';
import { Binding } from './binding/binding';


export const routes: Routes = [
    {
        path: '',
        component: Binding
    },
    {
        path: 'dashboard',
        component: Dashboard,
    },
    {
        path: 'forms',
        component: Forms
    },
    {
        path: 'navbar',
        component: Navbar,
    },
    {
        path: 'home',
        component: Home,
        children:[
            {
                path: 'navbar',
                component: Navbar,
                children:[
                    {
                        path: 'regform',
                        component: FormTask
                    }
                ]
            }
        ]
    },
    {
        path: 'dataservice',
        component: DataService
    },
    {
        path: '**',
        component: Wild
    }

];
