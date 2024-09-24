# Project Setup Instructions

## Integrating Tailwind CSS

To include Tailwind CSS in your HTML files, run the following command:

```bash
npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch
```

## To use Flowbite component in HTML Files [[Link]](https://flowbite.com/):

Via CDN:
1) Add Flowbite CSS in the head section
```bash
<link href="https://cdn.jsdelivr.net/npm/flowbite@2.5.1/dist/flowbite.min.css" rel="stylesheet" />
```

2) Add Flowbite JS before the closing body tag
```bash
<script src="https://cdn.jsdelivr.net/npm/flowbite@2.5.1/dist/flowbite.min.js"></script>
```  

## To learn more about Thymeleaf Page Layouts [[Link]](https://www.thymeleaf.org/doc/articles/layouts.html) 

Add in the html tag:
```bash
xmlns:th="http://www.thymeleaf.org"
```

## To use Icons:
1) [Flaticon](https://www.flaticon.com/search)
2) [FontAwesome](https://fontawesome.com/search)
   
Add the FontAwesome CDN link in the head section:
```bash
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
```
