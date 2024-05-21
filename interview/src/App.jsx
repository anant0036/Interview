import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [todos, setTodos] = useState(null)
  const [payload, setPayload] = useState({})

  useEffect(() => {
    fetch(`http://localhost:8080/todo`)
      .then(resp => resp.json())
      .then(data => setTodos(data))
      .catch(error => alert(error))
  }, [])

  const handleSubmit = (event) => {
    event.preventDefault()
    let data = {
      action: event.target.elements.action.value,
      isCompleted: false
    }

    fetch(`http://localhost:8080/todo`, {
      method: `POST`,
      body: JSON.stringify(data),
      headers: {
        "Content-type": "application/json"
      }
    })
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(error => console.error(error))
  }

  return (
    <>
      <form onSubmit={handleSubmit}>
            <input type="text" name="action"/>
            <button type="submit">Add todo</button>
      </form>
      {todos && todos.map(todo => {
        return <div key={todo.action}>
          <p>{todo?.action}</p>
          <p>{todo?.isCompleted}</p>
        </div>
      })}
    </>
  )
}

export default App
