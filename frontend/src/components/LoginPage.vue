<script setup>
import { ref } from 'vue'
</script>

<template>

<h2>The world 1 Ishan</h2>
<form @submit.prevent="HandleData" method="post">
<label for="name">Name:</label>
<input type="text" id="name" v-model="formData.name" required>

 <button type="submit">Submit</button>
</form>
</template>

<style scoped>
.read-the-docs {
  color: #888;
}
</style>
<script>
export default {
    data(){
        return {
        formData: {
        name: ''
        }
        }
    },
    methods: {
    async HandleData() {
              const res = await fetch('http://localhost:8080/api/submit', {
              method: 'POST',
              headers: { 'Content-Type': 'application/json' },
              body: JSON.stringify(this.formData)
            })
            const data = await res.text()
            console.log('Backend response:', data)
            console.log('Form submitted:', this.formData);
        }
    }
};
</script>

