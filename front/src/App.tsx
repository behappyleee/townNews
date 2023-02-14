import React from 'react';
import { BrowserRouter } from 'react-router-dom';
import { Routes, Route} from 'react-router';
import './App.css';
import LoginMain from './login/LoginMain';
import JoinMain from './join/JoinMain';
import MainLanding from './main/MainLanding';
import TemplateTest from './test/TemplateTest';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
           <Routes>  
                <Route path="/test" element={ <TemplateTest/> }></Route>          {/* Test Page */}
                <Route path="/" element={ <MainLanding/> }></Route>               {/* Main Page */}
                <Route path="/login" element={<LoginMain />} ></Route>            {/* Login Page */}
                <Route path="/join" element={<JoinMain />} ></Route>              {/* Join Page */}
            </Routes> 
         </BrowserRouter> 
    </div>
  );
}

export default App;
