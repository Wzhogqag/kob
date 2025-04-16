<template>
  <NavBar>

  </NavBar>

  <router-view/>
</template>


<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/boostrap.min.css"
import "bootstrap/dist/js/boostrap"

export default{
  components:{
    NavBar
  }

}

</script>

<style>
body{
  background-image: url("@/assets/background.png");
  background-size: cover;
}
</style>
