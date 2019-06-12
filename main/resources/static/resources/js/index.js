var app = (function(){    //var app- json객체
   let init=function(){
      login_form();
   }
  let login_form = function(){
   var wrapper = document.querySelector('#wrapper');  
   wrapper.innerHTML = '<form action="/action_page.php">'
   +'  First name:<br>'
   +'  <input type="text" name="firstname" value="Mickey">'
   +'  <br>'
   +'  Last name:<br>'
   +'  <input type="text" name="lastname" value="Mouse">'
   +'  <br><br>'
   +'  <input type="submit" value="Login">'
   +'</form> '

   //
   let join_form = function(){
      var wrapper = document.querySelector('#wrapper');  
      wrapper.innerHTML = '<form action="/action_page.php">'
      '  id:<br>'
      '  <input type="text" name="" >'
      '  <br>'
      '  pw:<br>'
      '  <input type="num" name="" >'
      '  name:<br>'
      '  <input type="text" name="" >'
      '  phone:<br>'
      '  <input type="num" name="" >'
      '  <br><br>'
      ' <input type="button" value="회원가입">'    
      '</form> '
//

   var btn = document.querySelector('#btn');
   var target = document.getElementById('target');
   btn.addEventListener('click', function(){
     target.innerHTML='';
   });
   var btn2 = document.querySelector('#btn2');
   btn2.addEventListener('click',function(){
     var temp = document.createTextNode('새로추가됨');
     target.appendChild(temp);
    });
//
    var btn3 = document.querySelector('#btn3');
    btn3.addEventListener('click',function(){
       target.appendChild(temp);
    });
//

   }
   return {init : init};       //클로저 
}});   