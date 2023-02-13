import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import './App.css';
import LoginMain from './login/LoginMain';
import JoinMain from './join/JoinMain';
import MainLanding from './main/MainLanding';

function App() {
  return (
    <div className="App">
        <BrowserRouter>
            <Routes>
                <Route path="/" element={ <MainLanding/> }></Route>
                <Route path="/login" element={<LoginMain />} ></Route>
                <Route path="/join" element={<JoinMain />} ></Route>
            </Routes>
        </BrowserRouter>
    </div>
  );
}

export default App;
