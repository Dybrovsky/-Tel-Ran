class Block extends React.Component{
    render(){
        const subTitle = 'Hello MASA'
        return (
            <React.Fragment>
            <h1>Hello World</h1>
              <h2>{subTitle}</h2>  
                <h3>{10+1/3*5}</h3>
                <h4>{(Math.random()*100).toFixed(2)}</h4>
            </React.Fragment>)
    }
}

ReactDOM.render(<div><Block><Block></Block></Block></div>, document.getElementById('root'))
