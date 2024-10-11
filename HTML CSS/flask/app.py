from flask import Flask, render_template, request, redirect, url_for, session
import os
import subprocess

app = Flask(__name__)
app.secret_key = '123'

@app.route('/', methods=['GET', 'POST'])
def index():
    cmd = session.get('comandos', [])
    ping_result = session.get('ping_result')
    return render_template("index.html", cmd=cmd, ping_result=ping_result)

@app.route('/<string:nome>')
def error(nome):
    return render_template("error.html", variavel=nome)

@app.route('/sobre')
def sobre():
    return render_template("sobre.html")

@app.route('/comando/', methods=['POST'])
def comando():
    cmd = os.listdir()
    session['comandos'] = cmd
    return redirect(url_for('index'))

@app.route('/ping', methods=['POST'])
def ping():
    ip_address = request.form['ip_address']
    result = subprocess.run(['ping', '-n', '1', ip_address], capture_output=True, text=True)
    ping_output = result.stdout
    session['ping_result'] = {
        'ip_address': ip_address,
        'ping_output': ping_output
    }
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(debug=True)
