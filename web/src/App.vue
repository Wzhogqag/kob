<template>
  <NavBar>

  </NavBar>

  <router-view/>
</template>


<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from 'jquery'


export default{
  components:{
    NavBar
  },
  setup(){
    $.ajax({
      url: "http://localhost:3000/user/account/token/",
      type:"post",
      data:{
        username:'wzq',
        password:'pwzq',
      },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      },
    });

    $.ajax({
      url: "http://localhost:3000/user/account/info/",
      type:"get",
      headers:{
        Authorization:"Bearer "+"eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIzNjNhMTE3YWYzMmU0YWUxOGZlYzVjNzZiNDlhNDIyOCIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTc0NTMyNjI1NCwiZXhwIjoxNzQ2NTM1ODU0fQ.owhYAC5ml6N0dgZW05d6rrOmrSA6xv6ZqcvMV_kiukU"
      },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      },
    });
    $.ajax({
      url: "http://localhost:3000/user/account/register/",
      type:"post",
      data:{
        username:' ',
        password:'pxt',
        confirmedPassword:"pxt",
      },
      success(resp){
        console.log(resp);
      },
      error(resp){
        console.log(resp);
      },
    });




  }


}

</script>

<style>
body{
  background-image: url("@/assets//images/background.png");
  background-size: cover;
}
</style>
