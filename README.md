# NotesAPI

## Estructura de la información

```
user {
    name,
    email,
    password,
    notes {
        title,
        body
    }
}
```
---
## Rutas
- `auth/register` :
    - `POST`: Recibe `name, email, password` y rear un usuario
- `auth/login` :
    - `POST`: Recibe `email, password` y devuelve el token para la autenticación

## Estas rutas necesitan el token de autenticación
Para enviar el toquen a las siguientes rutas se edebe agregar el header `Authorization` y su valor debe ser `bearer TOKEN`, donde `TOKEN` es el obtenido en la ruta `/login`.

- `auth/profile`:
    - `GET`: Devuelve el `name, email`
    - `PATCH`: Recibe `name, email, password` y actualiza al usuario

- `/notes`:
    - `GET`: Devuelve todas las notas del usuario autenticado
    - `POST`: Recibe `title, body`, crea una nota y se la añade al usuario autenticado
- `/notes/:id`:
    - `GET`: Devuelve `title, body` de la nota requerida por su `:id`
    - `PATCH`: Recibe `title, body` y actualiza la nota
    - `DELETE`: Elimina la nota a la que pertenece el `:id`