<template>
    <ContentField>
        我的bot
    </ContentField>
</template>

<script>
import ContentField from '../../../components/ContentField.vue'
import $ from "jquery"

export default{
  components:{
    ContentField
  },
  setup() {
    const jwt_token = localStorage.getItem("jwt_token");
    $.ajax({
      url: "http://localhost:3000/user/bot/add/",
      type: "post",
      data: {
        title: "Bot的标题",
        description: "Bot的描述",
        content: "Bot的代码",
      },
      hesders: {
        Authorization: "Bearer " + jwt_token,
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      },
    });
  }

}

</script>


<style scoped>

</style>